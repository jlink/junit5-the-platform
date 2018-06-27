package nano;

import org.junit.platform.engine.*;
import org.junit.platform.engine.support.descriptor.*;

import java.util.*;

public class NanoEngine implements TestEngine {


	@Override
	public String getId() {
		return "nano";
	}

	@Override
	public TestDescriptor discover(EngineDiscoveryRequest discoveryRequest, UniqueId engineId) {
		EngineDescriptor engineDescriptor = new EngineDescriptor(engineId, "Nano Engine");

		engineDescriptor.addChild(new NanoTestDescriptor(engineId, "test1"));
		engineDescriptor.addChild(new NanoTestDescriptor(engineId, "test2"));

		return engineDescriptor;
	}

	@Override
	public void execute(ExecutionRequest request) {
		request.getEngineExecutionListener().executionStarted(request.getRootTestDescriptor());

		Set<? extends TestDescriptor> testDescriptors = request.getRootTestDescriptor().getChildren();
		testDescriptors.forEach(descriptor -> {
			request.getEngineExecutionListener().executionStarted(descriptor);
			TestExecutionResult executionResult = executeTest(
					descriptor.getDisplayName().endsWith("1"),
					descriptor.getDisplayName() + " should end with 1"
			);
			request.getEngineExecutionListener().executionFinished(descriptor, executionResult);
		});

		request.getEngineExecutionListener().executionFinished(request.getRootTestDescriptor(), TestExecutionResult.successful());
	}

	private TestExecutionResult executeTest(boolean condition, String message) {
		return condition ?
					TestExecutionResult.successful() :
					TestExecutionResult.failed(new AssertionError(message));
	}

}

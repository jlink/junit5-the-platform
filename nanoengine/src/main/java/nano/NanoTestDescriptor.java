package nano;

import org.junit.platform.engine.*;
import org.junit.platform.engine.support.descriptor.*;

public class NanoTestDescriptor extends AbstractTestDescriptor{

	NanoTestDescriptor(UniqueId engineId, String name) {
		super(engineId.append("nano-test", name), name);
	}

	@Override
	public Type getType() {
		return Type.TEST;
	}

}

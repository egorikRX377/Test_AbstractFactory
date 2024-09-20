package ConcreteFactories;

import Classes.*;

import abstracts.DeviceFactory;
import abstracts.IKeyboard;
import abstracts.IMouse;

public class BloodyFactory implements DeviceFactory
{
    @Override
    public IKeyboard createKeyboard() {
        return new BloodyKeyboard();
    }

    @Override
    public IMouse createMouse() {
        return new BloodyMouse();
    }
}

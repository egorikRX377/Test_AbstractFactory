package ConcreteFactories;
import Classes.*;
import abstracts.DeviceFactory;
import abstracts.IKeyboard;
import abstracts.IMouse;

public class HyperXFactory implements DeviceFactory
{
    @Override
    public IKeyboard createKeyboard() {
        return new HyperXKeyboard();
    }

    @Override
    public IMouse createMouse() {
        return new HyperXMouse();
    }
}

package Classes;

import abstracts.IKeyboard;

public class BloodyKeyboard implements IKeyboard
{
    @Override
    public void print() {
        System.out.println("Bloody Keyboard");
    }
}

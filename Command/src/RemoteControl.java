public class RemoteControl {

   Command[] onCommands, offCommands;
   Command undoCommand;
   public RemoteControl() {
       onCommands = new Command[7];
       offCommands = new Command[7];

       Command noCommand = new NoCommand();
       undoCommand = noCommand;

       for(int i=0; i<7; i++){
           onCommands[i] = noCommand;
           offCommands[i] = noCommand;
       }
   }
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot){
       onCommands[slot].execute();
       undoCommand = onCommands[slot];
    }

    public void offButtonWasPressed(int slot){
       offCommands[slot].execute();
       undoCommand = offCommands[slot];
    }
    public void undoButtonWasPressed(){
       undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "]" + onCommands[i].getClass().getName()
                    + " " + offCommands[i].getClass().getName() + "\n");
        }
        stringBuff.append("[undo] "+ undoCommand.getClass().getName() + "\n");
        return stringBuff.toString();
    }
}

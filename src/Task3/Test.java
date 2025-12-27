package Task3;

public class Test {
    public static void main(String[] args) {

        //Creating new stack
        DischargeStack stack = new DischargeStack();

        //Creating records object with DischargeRecord
        DischargeRecord record1 = new DischargeRecord(1);
        DischargeRecord record2 = new DischargeRecord(2);
        DischargeRecord record3 = new DischargeRecord(3);
        DischargeRecord record4 = new DischargeRecord(4);
        DischargeRecord record5 = new DischargeRecord(5);

        //push all records object to the stack
        stack.push(record1);
        stack.push(record2);
        stack.push(record3);
        stack.push(record4);
        stack.push(record5);


        //Popping records from the top of the stack
        stack.pop();
        stack.pop();

        //printing remaining records from the stack
        stack.printStack();

    }
}

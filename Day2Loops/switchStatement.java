package Day2Loops;

public class switchStatement {

    public void printShirtSize(char shirt) {
        String msg = " ";
        switch (shirt) {
            case 's':
            case 'S':
                msg = "Shirt is small";
                break;
            case 'm':
            case 'M':
                msg = "Shirt is medium";
                break;
            case 'l':
            case 'L':
                msg = "Shirt is large";
                break;
            case 'x':
            case 'X':
                msg = "Shirt is Xtra large";
                break;
            default:
                msg = "Unknown shirt size";
                break;
        }
        System.out.println(msg);
    }
}

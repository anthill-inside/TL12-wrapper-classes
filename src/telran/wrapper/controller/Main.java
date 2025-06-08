package telran.wrapper.controller;

public class Main {
    public static void main(String[] args) {

        String result = "";

        if (args.length == 0){
            args = new String[]{"boolean", "byte","short","char","int","float","double"};
        }

        for (String arg:args) {

            String argUpper = arg.toUpperCase();

            switch (argUpper) {
                case "BOOLEAN":
                    result += argUpper + " MIN:" + false + " MAX:" + true +'\n';
                    break;
                case "BYTE":
                    result += argUpper + " MIN:" + Byte.MIN_VALUE + " MAX:" + Byte.MAX_VALUE +'\n';
                    break;
                case "SHORT":
                    result += argUpper + " MIN:" + Short.MIN_VALUE + " MAX:" + Short.MAX_VALUE +'\n';
                    break;
                case "CHAR":
                    result += argUpper + " MIN:" + Character.MIN_VALUE + " MAX:" + Character.MAX_VALUE +'\n';
                    break;
                case "INT":
                    result += argUpper + " MIN:" + Integer.MIN_VALUE + " MAX:" + Integer.MAX_VALUE +'\n';
                    break;
                case "FLOAT":
                    result += argUpper + " MIN:" + Float.MIN_VALUE + " MAX:" + Float.MAX_VALUE +'\n';
                    break;
                case "DOUBLE":
                    result += argUpper + " MIN:" + Double.MIN_VALUE + " MAX:" + Double.MAX_VALUE +'\n';
                    break;
                default:
                    result += "<"+arg+"> Wrong Type \n";

            }
        }
        System.out.println(result);
//        return result;

    }
}
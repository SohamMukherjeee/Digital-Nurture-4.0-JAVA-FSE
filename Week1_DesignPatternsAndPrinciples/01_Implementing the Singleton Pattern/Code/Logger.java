public class Logger {
    private static Logger instance;
    private Logger(){
        System.out.println("Instance succesfully created");
    }
    public static Logger getTheInstance(){
        if(instance==null){
            instance=new Logger();
        }
        return instance;
    }
    public void Msg(String ans ){
        System.out.println(ans);
    }
}

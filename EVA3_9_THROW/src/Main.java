public class Main {
    public static void main(String[] args) {
       try{
           metodoProblematico();
       }catch (Exception e){
           System.out.println(e);
       }


    }
    public static void metodoProblematico() throws Exception {
        System.out.println("Holi!!");
        throw new Exception("Falla del sistema");
        //System.out.println("GabosKon");NUNCA SE VA A EJECUTAR
    }
}
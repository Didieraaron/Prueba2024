public class Question{
//Declarar los atributos
   private String imageName;
   private int response;
   
   
   //Definir el m�todo constructor
   
   public Question(String imageName,int response){
      this.imageName=imageName;
      this.response=response;
   
   }//Fin del m�todo constructor
   
   public void setImageName(String imageName){
   
   }//fin del m�todo setImageName
   
   public String getImageName(){
      return imageName;
   }//Fin del m�todo getImageName
   
   public void setResponse(int response){
     this.response=response;
   }//Fin del m�todo setResponse
   
   public int getResponse(){
      return response;
   }//fin del m�todo getResponse
   
   
}//Fin de la clase

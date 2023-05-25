
package thiskeywordjava_exampleformyself;


public class ThisKeywordJava_ExampleForMyself {
    
    String food;
    char size;
    
public void setData(String food, char size) {
     this.food = food;
     this.size = size;
    }

    public static void main(String[] args) {
        ThisKeywordJava_ExampleForMyself t = new ThisKeywordJava_ExampleForMyself();
        t.setData("soup", 'L');
        System.out.println(t.food);
        System.out.println(t.size);
        
       
    }
    
}

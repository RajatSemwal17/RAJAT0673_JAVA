package COM.RAJAT.day51;

public class TOSTRING {
    String name;
    int rollNo;
    public TOSTRING(String n, int r){
        name = n;
        rollNo = r;
    }
    public String toString(){
        return "name: "+name +  "\nrollNo: " + rollNo;
    }

    public static void main(String[] args) {
        TOSTRING obj = new TOSTRING("RAJAT", 241);
        System.out.println(obj.toString());
    }
}
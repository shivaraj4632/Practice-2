public class student {
    String USN ,Name , Branch;
    int phone;

    student(String u, String n, String b, int p){
        USN = u;
        Name = n;
        Branch = b;
        phone = p;
    }
    void display(){
        System.out.println(USN + "\t"  +Name +"\t"  + Branch + "\t"  +phone);
    }
    public static void main(String[] args){
        student s[] = new student[3];
        s[0] = new student("1AJ25CY041","Rajesh","Cyber security",1234567890);
        s[1] = new student("1AJ25CY046","Rohith","Cyber security",1234565656);
        s[2] = new student("1AJ25CY043","Rishikesh","Cyber security",1234567890);

        System.out.println("USN\tName\tBranch\tphone");
        System.out.println("-----------------------------");

        for(int i = 0;i<3;i++){
            s[i].display();
        }
    }
}


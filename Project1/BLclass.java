package Project1;

public class BLclass {
    student[] studentlist = {
            new student(101 ,"Aaa" ,68.98),
            new student(102 ,"Baa" ,61.98),
            new student(103 ,"Caa" ,62.98),
            new student(104 ,"Daa" ,63.98),
            new student(105 ,"Eaa" ,64.98),
            new student(106 ,"Faa" ,65.98),
            new student(107 ,"Gaa" ,66.98),
            new student(108 ,"Haa" ,67.98),
            new student(109 ,"Iaa" ,88.98),
            new student(111 ,"Jaa" ,48.98),
    };
    public void highestScore(){
        int HSstudent = 0;
        for( int i = 0 ; i < studentlist.length ; i++ ){
            if(studentlist[i].marks > studentlist[HSstudent].marks){
                HSstudent = i ;
            }
        }
        studentlist[HSstudent].displayDetails();
    }
    public void lowestScore(){
        int Lsstudent = 0 ;
        for(int j =0 ; j < studentlist.length ; j++){
            if(studentlist[j].marks < studentlist[Lsstudent].marks){
                Lsstudent = j ;
            }
        }
        studentlist[Lsstudent].displayDetails();
    }
    public double calculateAvg()
    {
        double sum = 0.0 ;
        for(student s : studentlist)
            sum += s. marks;// sum = sum + s.marks

        double avg = sum/studentlist.length;
        return avg ;
    }
    public void passedStudent()
    {
        double avg = calculateAvg();
        for(student s: studentlist){
            if (s.marks >= avg)
            {
                System.out.println("------------");
                s.displayDetails();
            }
        }

    }

}

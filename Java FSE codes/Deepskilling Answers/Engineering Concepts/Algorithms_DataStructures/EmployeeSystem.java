class Employee {
    int employeeId;
    String name;
    String position;
    double salary;

    Employee(int id,String n,String p,double s){
        employeeId=id;
        name=n;
        position=p;
        salary=s;
    }
}

public class EmployeeSystem {

    static Employee arr[]=new Employee[100];
    static int count=0;

    static void add(Employee e){
        arr[count++]=e;
    }

    static Employee search(int id){
        for(int i=0;i<count;i++){
            if(arr[i].employeeId==id)
                return arr[i];
        }
        return null;
    }

    static void delete(int id){
        for(int i=0;i<count;i++){
            if(arr[i].employeeId==id){
                arr[i]=arr[count-1];
                count--;
            }
        }
    }
}
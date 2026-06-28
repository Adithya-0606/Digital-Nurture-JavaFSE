class Task {
    int taskId;
    String taskName;
    String status;
    Task next;

    Task(int id,String name,String s){
        taskId=id;
        taskName=name;
        status=s;
    }
}

public class TaskList {

    static Task head=null;

    static void add(int id,String name,String status){
        Task newNode=new Task(id,name,status);

        if(head==null){
            head=newNode;
            return;
        }

        Task temp=head;
        while(temp.next!=null)
            temp=temp.next;

        temp.next=newNode;
    }

    static void traverse(){
        Task temp=head;
        while(temp!=null){
            System.out.println(temp.taskName);
            temp=temp.next;
        }
    }

    static void delete(int id){
        if(head.taskId==id){
            head=head.next;
            return;
        }

        Task temp=head;
        while(temp.next!=null){
            if(temp.next.taskId==id){
                temp.next=temp.next.next;
                break;
            }
            temp=temp.next;
        }
    }
}
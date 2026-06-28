class Book {
    int bookId;
    String title;
    String author;

    Book(int id,String t,String a){
        bookId=id;
        title=t;
        author=a;
    }
}

public class LibrarySystem {

    static int linearSearch(Book arr[],String title){
        for(int i=0;i<arr.length;i++){
            if(arr[i].title.equals(title))
                return i;
        }
        return -1;
    }

    static int binarySearch(Book arr[],String title){
        int low=0,high=arr.length-1;

        while(low<=high){
            int mid=(low+high)/2;

            int cmp=arr[mid].title.compareTo(title);

            if(cmp==0) return mid;
            else if(cmp<0) low=mid+1;
            else high=mid-1;
        }
        return -1;
    }
}
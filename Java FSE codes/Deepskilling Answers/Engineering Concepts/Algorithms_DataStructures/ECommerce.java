class Product {
    int productId;
    String productName;
    String category;

    Product(int id,String n,String c){
        productId=id;
        productName=n;
        category=c;
    }
}

public class ECommerce {

    static int linearSearch(Product arr[], String name) {
        for(int i=0;i<arr.length;i++) {
            if(arr[i].productName.equals(name))
                return i;
        }
        return -1;
    }

    static int binarySearch(Product arr[], String name) {
        int low=0, high=arr.length-1;

        while(low<=high) {
            int mid=(low+high)/2;

            int cmp=arr[mid].productName.compareTo(name);

            if(cmp==0) return mid;
            else if(cmp<0) low=mid+1;
            else high=mid-1;
        }
        return -1;
    }
}
class hashing {
    private int size = 20;
    data[] hashtable = new data[size];
    public int index(int key){
        return key%size;
    }
    public void get(int key){
        int index1 =index(key);
        if (hashtable[index1]==null){
            System.out.println("Key does not exist");
        }else{
            data data1=hashtable[index1];
            while(data1!=null ){
                System.out.println(data1.data_key());
                System.out.println(data1.data_value());
                data1=data1.data_next();
            }
        }
    }
    public void insert(data data1){
        int key1= data1.data_key();
        //int value1= data1.data_value();
        //data next1 = null;
        int index1 = index(key1);
        if(hashtable[index1]==null){
            hashtable[index1]=data1;
        }
        else{
            data data2=hashtable[index1];
            while (data2.data_next()!=null && data2.data_key()!=key1){
                data2=data2.data_next();
            }
            data2.data_next1(data1);
        }
    }
    public void delete(data data1){
        int key1= data1.data_key();
        int value1= data1.data_value();
        int index1 = index(key1);
        while(hashtable[index1]!=null){
        if(hashtable[index1].data_key()==key1 && hashtable[index1].data_value()==value1 ){
            data data2=new data(-1,-1);
            hashtable[index1]=data2;
            System.out.println("data deleted ");
            break;
        }
        index1++;
        if(index1==size)
            index1=0;
        }    
    }
    void display(){
        for(int i=0;i<size;i++){
            if(hashtable[i]!=null){
                System.out.println(hashtable[i].data_key());
                System.out.println(hashtable[i].data_value());
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        data d1=new data(4,5);
        data d2=new data(22,5);
        data d3=new data(42,5);
        hashing h1= new hashing();
        h1.insert(d1);
        h1.insert(d2);
        h1.insert(d3);
        h1.get(22);
        h1.display();
        h1.delete(d2);
        h1.display();
    }
}
class data{
    private int key;
    private int value;
    private data next;
    data(int key1, int value1){
        key = key1;
        value = value1;
        next=null;
    }
    int data_key(){
        return key;
    }
    int data_value(){
        return value;
    }
    data data_next(){
        return next;
    }
    void data_next1(data next1){
        next=next1;
    }
}
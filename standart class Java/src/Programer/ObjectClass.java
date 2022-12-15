package Programer;

import java.util.Objects;

public class ObjectClass {

    // awas jangan tertukar, ini class Objects, bukan object 
    // object adalah class utility yang berisikan banyak static method yang bisa kita gunakan untuk operasi object atau melakukan pengecekan sebelum operasinya di lakukan 
public static class Data {
    private String data;

    public Data(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data  = data;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Data data1 = (Data) o;

        return data != null ? data.equals(data1.data) : data1.data == null;

    }

    @Override
    public int hashCode() {
        return data != null ? data.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Data{" + "data='"+ data + '\'' + '}';
    }

}

    public static void main(String[] args) {
        
        execute(new Data("Angga"));
    }

    public static void execute(Data data) {

        if(data != null) {
        System.out.println(Objects.toString(data));
        System.out.println(Objects.hashCode(data));
    }
    
}
}
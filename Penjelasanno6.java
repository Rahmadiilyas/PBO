import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class no6 {

    public static void main(String[] args) {
        // Stack menggunakan array
        StackArray stackArray = new StackArray(5); // Membuat objek stackArray dengan kapasitas 5
        stackArray.push(10); // Menambahkan nilai 10 ke dalam stackArray
        stackArray.push(20); // Menambahkan nilai 20 ke dalam stackArray
        stackArray.push(30); // Menambahkan nilai 30 ke dalam stackArray
        System.out.println("StackArray: " + stackArray); // Mencetak isi dari stackArray
        System.out.println("Pop: " + stackArray.pop()); // Menghapus dan mengembalikan nilai teratas dari stackArray
        System.out.println("Peek: " + stackArray.peek()); // Mengembalikan nilai teratas dari stackArray tanpa menghapusnya
        System.out.println("Is Empty: " + stackArray.isEmpty()); // Memeriksa apakah stackArray kosong
        System.out.println();

        // Stack menggunakan Vector
        StackVector stackVector = new StackVector(); // Membuat objek stackVector menggunakan Vector
        stackVector.push(40); // Menambahkan nilai 40 ke dalam stackVector
        stackVector.push(50); // Menambahkan nilai 50 ke dalam stackVector
        stackVector.push(60); // Menambahkan nilai 60 ke dalam stackVector
        System.out.println("StackVector: " + stackVector); // Mencetak isi dari stackVector
        System.out.println("Pop: " + stackVector.pop()); // Menghapus dan mengembalikan nilai teratas dari stackVector
        System.out.println("Peek: " + stackVector.peek()); // Mengembalikan nilai teratas dari stackVector tanpa menghapusnya
        System.out.println("Is Empty: " + stackVector.isEmpty()); // Memeriksa apakah stackVector kosong
        System.out.println();

        // Stack menggunakan ArrayList
        StackArrayList stackArrayList = new StackArrayList(); // Membuat objek stackArrayList menggunakan ArrayList
        stackArrayList.push(70); // Menambahkan nilai 70 ke dalam stackArrayList
        stackArrayList.push(80); // Menambahkan nilai 80 ke dalam stackArrayList
        stackArrayList.push(90); // Menambahkan nilai 90 ke dalam stackArrayList
        System.out.println("StackArrayList: " + stackArrayList); // Mencetak isi dari stackArrayList
        System.out.println("Pop: " + stackArrayList.pop()); // Menghapus dan mengembalikan nilai teratas dari stackArrayList
        System.out.println("Peek: " + stackArrayList.peek()); // Mengembalikan nilai teratas dari stackArrayList tanpa menghapusnya
        System.out.println("Is Empty: " + stackArrayList.isEmpty()); // Memeriksa apakah stackArrayList kosong
        System.out.println();

        // Stack menggunakan LinkedList
        StackLinkedList stackLinkedList = new StackLinkedList(); // Membuat objek stackLinkedList menggunakan LinkedList
        stackLinkedList.push(100); // Menambahkan nilai 100 ke dalam stackLinkedList
        stackLinkedList.push(110); // Menambahkan nilai 110 ke dalam stackLinkedList
        stackLinkedList.push(120); // Menambahkan nilai 120 ke dalam stackLinkedList
        System.out.println("StackLinkedList: " + stackLinkedList); // Mencetak isi dari stackLinkedList
        System.out.println("Pop: " + stackLinkedList.pop()); // Menghapus dan mengembalikan nilai teratas dari stackLinkedList
        System.out.println("Peek: " + stackLinkedList.peek()); // Mengembalikan nilai teratas dari stackLinkedList tanpa menghapusnya
        System.out.println("Is Empty: " + stackLinkedList.isEmpty()); // Memeriksa apakah stackLinkedList kosong
    }
}

class StackArray {
    private int maxSize; // Ukuran maksimum stackArray
    private double[] stackArray; // Array untuk menyimpan elemen-elemen stack
    private int top; // Indeks dari elemen teratas stack

    // Konstruktor untuk membuat stackArray dengan ukuran tertentu
    public StackArray(int size) {
        maxSize = size;
        stackArray = new double[maxSize];
        top = -1; // Atur top ke -1 karena stack kosong
    }

    // Metode untuk menambahkan elemen ke dalam stack
    public void push(double value) {
        stackArray[++top] = value; // Tambahkan nilai ke dalam stack dan naikkan top
    }

    // Metode untuk menghapus dan mengembalikan nilai teratas dari stack
    public double pop() {
        return stackArray[top--]; // Kurangi top dan kembalikan nilai yang dihapus
    }

    // Metode untuk mengembalikan nilai teratas dari stack tanpa menghapusnya
    public double peek() {
        return stackArray[top]; // Kembalikan nilai teratas dari stack
    }

    // Metode untuk memeriksa apakah stack kosong
    public boolean isEmpty() {
        return (top == -1); // Stack kosong jika top adalah -1
    }

    // Metode untuk mengubah isi stack menjadi string
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (int i = 0; i <= top; i++) {
            sb.append(stackArray[i]).append(" ");
        }
        sb.append("]");
        return sb.toString();
    }
}
// Kelas StackVector menggunakan struktur data Vector untuk mengimplementasikan stack.
// Vector adalah kelas yang sudah tersedia di Java untuk menyimpan koleksi objek yang dinamis.
// Kelas ini memiliki metode push untuk menambahkan elemen ke dalam stack, pop untuk menghapus dan mengembalikan elemen teratas, 
// peek untuk hanya melihat elemen teratas tanpa menghapusnya, isEmpty untuk memeriksa apakah stack kosong,
// dan toString untuk mengubah isi stack menjadi string.

class StackVector {
    private Vector<Double> stackVector; // Mendeklarasikan Vector untuk menyimpan elemen-elemen stack

    // Konstruktor untuk membuat objek StackVector baru
    public StackVector() {
        stackVector = new Vector<>(); // Inisialisasi objek Vector
    }

    // Metode untuk menambahkan elemen ke dalam stack
    public void push(double value) {
        stackVector.add(value); // Menambahkan elemen ke dalam Vector
    }

    // Metode untuk menghapus dan mengembalikan nilai teratas dari stack
    public double pop() {
        double value = stackVector.lastElement(); // Mengambil elemen teratas stack
        stackVector.remove(stackVector.size() - 1); // Menghapus elemen teratas stack
        return value; // Mengembalikan nilai yang dihapus
    }

    // Metode untuk hanya mengembalikan nilai teratas dari stack tanpa menghapusnya
    public double peek() {
        return stackVector.lastElement(); // Mengembalikan elemen teratas stack
    }

    // Metode untuk memeriksa apakah stack kosong
    public boolean isEmpty() {
        return stackVector.isEmpty(); // Mengembalikan true jika stack kosong
    }

    // Metode untuk mengubah isi stack menjadi string
    @Override
    public String toString() {
        return stackVector.toString(); // Mengembalikan representasi string dari Vector
    }
}

// Kelas StackArrayList juga menggunakan ArrayList, kelas yang menyediakan struktur data dinamis yang dapat menyimpan koleksi objek.
// Implementasinya mirip dengan StackVector, hanya berbeda dalam tipe kelas yang digunakan untuk menyimpan data.

class StackArrayList {
    private ArrayList<Double> stackArrayList; // Mendeklarasikan ArrayList untuk menyimpan elemen-elemen stack

    // Konstruktor untuk membuat objek StackArrayList baru
    public StackArrayList() {
        stackArrayList = new ArrayList<>(); // Inisialisasi objek ArrayList
    }

    // Metode untuk menambahkan elemen ke dalam stack
    public void push(double value) {
        stackArrayList.add(value); // Menambahkan elemen ke dalam ArrayList
    }

    // Metode untuk menghapus dan mengembalikan nilai teratas dari stack
    public double pop() {
        double value = stackArrayList.get(stackArrayList.size() - 1); // Mengambil elemen teratas stack
        stackArrayList.remove(stackArrayList.size() - 1); // Menghapus elemen teratas stack
        return value; // Mengembalikan nilai yang dihapus
    }

    // Metode untuk hanya mengembalikan nilai teratas dari stack tanpa menghapusnya
    public double peek() {
        return stackArrayList.get(stackArrayList.size() - 1); // Mengembalikan elemen teratas stack
    }

    // Metode untuk memeriksa apakah stack kosong
    public boolean isEmpty() {
        return stackArrayList.isEmpty(); // Mengembalikan true jika stack kosong
    }

    // Metode untuk mengubah isi stack menjadi string
    @Override
    public String toString() {
        return stackArrayList.toString(); // Mengembalikan representasi string dari ArrayList
    }
}

// Kelas StackLinkedList menggunakan LinkedList, struktur data yang menyediakan linked list berantai untuk menyimpan elemen-elemen stack.
// Implementasinya juga mirip dengan StackVector dan StackArrayList.

class StackLinkedList {
    private LinkedList<Double> stackLinkedList; // Mendeklarasikan LinkedList untuk menyimpan elemen-elemen stack

    // Konstruktor untuk membuat objek StackLinkedList baru
    public StackLinkedList() {
        stackLinkedList = new LinkedList<>(); // Inisialisasi objek LinkedList
    }

    // Metode untuk menambahkan elemen ke dalam stack
    public void push(double value) {
        stackLinkedList.addLast(value); // Menambahkan elemen ke dalam LinkedList
    }

    // Metode untuk menghapus dan mengembalikan nilai teratas dari stack
    public double pop() {
        return stackLinkedList.removeLast(); // Menghapus dan mengembalikan elemen teratas stack
    }

    // Metode untuk hanya mengembalikan nilai teratas dari stack tanpa menghapusnya
    public double peek() {
        return stackLinkedList.getLast(); // Mengembalikan elemen teratas stack
    }

    // Metode untuk memeriksa apakah stack kosong
    public boolean isEmpty() {
        return stackLinkedList.isEmpty(); // Mengembalikan true jika stack kosong
    }

    // Metode untuk mengubah isi stack menjadi string
    @Override
    public String toString() {
        return stackLinkedList.toString(); // Mengembalikan representasi string dari LinkedList
    }
}

package Java_Tutorials;

interface InterfaceExam {
    void getdata();
    void putdata();
}
interface a{

}
interface b{
    void mark1();
    void mark2();
}
interface c{
    void mark1_result();
    void mark2_result();
}
interface d extends InterfaceExam, b, c{
    void Display();
}




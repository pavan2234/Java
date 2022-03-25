package pavan.tasks;
interface test
{
int square();
}

class arithmetic1 implements test
{
int b;

arithmetic1(int x)
{
b = x;
}

public int square()
{
return (b*b);
}

}
class ToTestInt
{
public int return_ans(int x)
{
arithmetic1 a=new arithmetic1(x);
return a.square();
}
}
class main_class
{
public static void main(String []args)
{
ToTestInt x= new ToTestInt();




System.out.println("\nThe square of 64 is "+x.return_ans(64));
}
}

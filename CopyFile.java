import java.io.*;
class CopyFile
{
public static void main(String args[]) throws IOException, FileNotFoundException
{
int a;
int c=0;
File f1=new File("//home//exam//f1.txt");
File f2=new File("//home//exam//f2.txt");
File f3=new File("//home//exam//f3.txt");
FileInputStream fin=new FileInputStream(f1);
FileOutputStream fop1=new FileOutputStream(f2);
FileOutputStream fop2=new FileOutputStream(f3);
do
{
fin.read();
if(a!=-1)
{
fin.write(a);
while(a%2==0)
c=1;
}
if(c==1)
fop1.write(a);
else
fop2.write(a);
}
while(a!=-1);
{
fin.close();
fop1.close();
fop2.close();
}
}
}

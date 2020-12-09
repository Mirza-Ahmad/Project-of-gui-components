package projectgui;
import javax.swing.*;
import java.util.*;
public class ProjectGui
{
  JFrame f=new JFrame();
  public void Fabbonaci_Series()
  {
        String s;
        int size,a=0,b=1;
        int d;
  	s=JOptionPane.showInputDialog(f,"Enter the number of terms of fabbonaci series to print :");
        size=Integer.parseInt(s);
        JOptionPane.showMessageDialog(f,"The fibnocci series is and Press enter to check the series","",JOptionPane.WARNING_MESSAGE);
  	for(int i=0; i<size; i++)
  	{
	  d=a+b;
	  a=b;
	  b=d;
          JOptionPane.showMessageDialog(f," "+ d + " ");
    }
  } 
  public void Factorial()
  {
      String fr;
      int rp,n=1;
      fr=JOptionPane.showInputDialog(f,"Enter the size of the number:");
      rp=Integer.parseInt(fr);
      int i=rp;
      while(i>=1)
      {
        n*=i;
        i--;  
      }
      JOptionPane.showMessageDialog(f,"The factorial of this number is = " + n);
  }
  public static int Permutaion(int n)
  {
       if(n==0 || n==1)
       {
          return 1;
       }
       else 
       return n*Permutaion(n-1);
  }
 public void Derivative()
  {
  	int x,d_cof_1,b;
        int exp;
        String s,g,ty,hg;
        int d_cof_2,exp2;
  	s=JOptionPane.showInputDialog(f,"1. one cofficient : 2. two cofficient: 3. three cofficient:");
  	x=Integer.parseInt(s);
  	if(x==1)
  	{
  		s=JOptionPane.showInputDialog(f,"Enter the cofficient :");
  		d_cof_1=Integer.parseInt(s);
  		s=JOptionPane.showInputDialog(f,"Enter the exponent :");
                exp=Integer.parseInt(s);
                JOptionPane.showMessageDialog(f,"Derivative is = "+ d_cof_1*exp + "x^"+(exp-1));
	}
	else if(x==2)
	{
		s=JOptionPane.showInputDialog(f,"Enter the first cofficient :");
  		d_cof_1=Integer.parseInt(s);
  		g=JOptionPane.showInputDialog(f,"Enter the first exponent :");
  		exp=Integer.parseInt(g);
                ty=JOptionPane.showInputDialog(f,"Enter the second cofficient :");
  		d_cof_2=Integer.parseInt(ty);
  		hg=JOptionPane.showInputDialog(f,"Enter the second exponent :");
  		exp2=Integer.parseInt(hg);
                JOptionPane.showMessageDialog(f, "Derivative is = " + d_cof_1*exp + "x^"+(exp-1)+"+"+d_cof_2*exp2+"x^"+(exp2-1)+JOptionPane.INFORMATION_MESSAGE);
	}
	else if(x==3)
	{
                int d_cof_3,exp3;
                String er,mn;
		s=JOptionPane.showInputDialog(f,"Enter the first cofficient :");
  		d_cof_1=Integer.parseInt(s);
  		g=JOptionPane.showInputDialog(f,"Enter the first exponent :");
  		exp=Integer.parseInt(g);
                ty=JOptionPane.showInputDialog(f,"Enter the second cofficient :");
  		d_cof_2=Integer.parseInt(ty);
  		hg=JOptionPane.showInputDialog(f,"Enter the second exponent :");
  		exp2=Integer.parseInt(hg);
                er=JOptionPane.showInputDialog(f,"Enter the third cofficient :");
  		d_cof_3=Integer.parseInt(er);
  		mn=JOptionPane.showInputDialog(f,"Enter the third exponent :");
  		exp3=Integer.parseInt(mn);
                JOptionPane.showMessageDialog(f, "Derivative is = "+ d_cof_1*exp+"x^"+(exp-1)+"+"+d_cof_2*exp2+"x^"+(exp2-1)+ "+" +d_cof_3*exp3+"x^"+(exp3-1)+JOptionPane.INFORMATION_MESSAGE);
	}
  }
 public void integration()
 {
 String g,m,cd;
 int y,jk,nb,exp1;
 g=JOptionPane.showInputDialog(f," Press 1 : For 1 cofficent \n Press 2 : For 2 cofficent \n Press 3 : For 3 cofficent:");
 jk=Integer.parseInt(g);
 if(jk==1)
 {
 m=JOptionPane.showInputDialog(f,"Enter the cofficent:");
 nb=Integer.parseInt(m);
 cd=JOptionPane.showInputDialog(f,"Enter the exponent:");
 exp1=Integer.parseInt(cd);
 JOptionPane.showMessageDialog(f, "The integration is = " +nb + "x^" + (exp1+1)+"/"+(exp1+1)+ "+" +" c ");
 }
 else if(jk==2)
 {
 String fg,kg;
 int we,ke;
 m=JOptionPane.showInputDialog(f,"Enter the first cofficent:");
 nb=Integer.parseInt(m);
 cd=JOptionPane.showInputDialog(f,"Enter the first exponent:");
 exp1=Integer.parseInt(cd);
 fg=JOptionPane.showInputDialog(f,"Enter the second cofficent:");
 we=Integer.parseInt(fg);
 kg=JOptionPane.showInputDialog(f,"Enter the second exponent:");
 ke=Integer.parseInt(kg);
 JOptionPane.showMessageDialog(f, "The integration is = " + nb + "x^" + (exp1+1)+"/"+(exp1+1)+ " + " + fg + "x^" + (ke+1)+"/"+(ke+1)+" + "+ " c ");    
 }
 else if(jk==3)
 {
  String fg,kg,pp,qwe;
  int we,ke,dd,jkl;
  m=JOptionPane.showInputDialog(f,"Enter the first cofficent:");
  nb=Integer.parseInt(m);
  cd=JOptionPane.showInputDialog(f,"Enter the first exponent:");
  exp1=Integer.parseInt(cd);
  fg=JOptionPane.showInputDialog(f,"Enter the second cofficent:");
  we=Integer.parseInt(fg);
  kg=JOptionPane.showInputDialog(f,"Enter the second exponent:");
  ke=Integer.parseInt(kg);
  pp=JOptionPane.showInputDialog(f,"Enter the third cofficent:");
  dd=Integer.parseInt(pp);
  qwe=JOptionPane.showInputDialog(f,"Enter the third exponent:");
  jkl=Integer.parseInt(qwe);
  JOptionPane.showMessageDialog(f, "The integration is = " + nb + "x^" + (exp1+1)+"/"+(exp1+1)+ " + " + fg + "x^" + (ke+1)+"/"+(ke+1)+" + "+ pp + "x^"+(jkl+1)+"/"+(jkl+1)+" + "+" c");       
 }
 }
 public void integral()
 {
  String Int1,Int2,mnb;
  int gh,mn,cv;
  Int1=JOptionPane.showInputDialog(f,"Enter the upper limit");
  gh=Integer.parseInt(Int1);
  Int2=JOptionPane.showInputDialog(f,"Enter the lower limit:");
  mn=Integer.parseInt(Int2);
  mnb=JOptionPane.showInputDialog(f,"Press 1: For one cofficent \n Press 2: For two cofficent \n Press 3: For 3 cofficent:");
  cv=Integer.parseInt(mnb);
  if(cv==1)
  {
   Scanner is=new Scanner(System.in);
   int aqw;
   char qrt;
   float rte;
   System.out.println("Enter the cofficent:");
   qrt=is.next().charAt(0);
   System.out.println("Enter the exponent:");
   rte=is.nextInt();
   int r=(int)((int)Math.pow(gh, rte+1)/(rte+1));
   int we=r-(int)((int)Math.pow(mn, rte+1)/(rte+1));
   System.out.println("The integral is = " + we);
  }
  else if(cv==2)
  {
   Scanner is=new Scanner(System.in);
   int aqw;
   char qrt,brt;
   float rte,mnv;
   System.out.println("Enter the cofficent:");
   qrt=is.next().charAt(0);
   System.out.println("Enter the exponent:");
   rte=is.nextInt();
   System.out.println("Enter the second cofficent:");
   brt=is.next().charAt(0);
   System.out.println("Enter the second exponent:");
   mnv=is.nextInt();
   int r=(int)((int)Math.pow(gh, rte+1)/(rte+1))+(int)((int)Math.pow(gh, mnv+1)/(mnv+1));
   int ew=r-(int)((int)Math.pow(mn, rte+1)/(rte+1))+(int)((int)Math.pow(mn, mnv+1)/(mnv+1));
   System.out.println("The integral is = " + ew);
  }
  else if(cv==3)
  {
   Scanner is=new Scanner(System.in);
   int aqw;
   char qrt,brt,wert;
   float rte,mnv,ilk;
   System.out.println("Enter the cofficent:");
   qrt=is.next().charAt(0);
   System.out.println("Enter the exponent:");
   rte=is.nextInt();
   System.out.println("Enter the second cofficent:");
   brt=is.next().charAt(0);
   System.out.println("Enter the second exponent:");
   mnv=is.nextInt();
   System.out.println("Enter the third cofficent:");
   wert=is.next().charAt(0);
   System.out.println("Enter the third exponent:");
   ilk=is.nextInt();
   int r=(int)((int)Math.pow(gh, rte+1)/(rte+1))+(int)((int)Math.pow(gh, mnv+1)/(mnv+1))+(int)((int)Math.pow(gh, ilk+1)/(ilk+1));
   int ew=r-(int)((int)Math.pow(mn, rte+1)/(rte+1))+(int)((int)Math.pow(mn, mnv+1)/(mnv+1))+(int)((int)Math.pow(mn, ilk+1)/(ilk+1));
   System.out.println("The integral is = " + ew);
  }
 }
 public static void main(String[] args) 
    {
        JFrame df=new JFrame();
        ProjectGui yt=new ProjectGui();
        String ds;
        int yr;
        while(true)
        {
        ds=JOptionPane.showInputDialog(df," Press 1 For check the Fibnocci sereis: \n Press 2: For check the Derivative: \n Press 3: For check the permutation and combination: \n Press 4: For check the integration: \n Press 5: For check the Integral: \n Press 6: For exit the program:");
        yr=Integer.parseInt(ds);
        if(yr==1)
        {
        yt.Fabbonaci_Series();
        }
        else if(yr==2)
        {
        yt.Derivative();
        }
        else if(yr==3)
        {
         String u,j,mb;
         char ch;
         int n,r;
         Scanner iu=new Scanner(System.in);
         u=JOptionPane.showInputDialog(df, "Enter the value of n");
         n=Integer.parseInt(u);
         j=JOptionPane.showInputDialog(df, "Enter the value of r");
         r=Integer.parseInt(j);
         int nam = Permutaion(n)/Permutaion(n-r);
         JOptionPane.showMessageDialog(df,"The permutation of this number is = " + nam);
         int yq=nam/Permutaion(r);
         JOptionPane.showMessageDialog(df, "The combnination of this number is = " +yq);
       }
        else if(yr==4)
        {
          yt.integration();
        }
        else if(yr==5)
        {
          yt.integral();
        }
        else if(yr==6)
        {
          System.exit(yr);
        }
      }
   }
}
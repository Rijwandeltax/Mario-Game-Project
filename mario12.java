import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class mario12 extends Applet implements KeyListener{
	String s="";
	AudioClip au,au1;
	 int flag,x,p,q,j,t,x1,b,jmp,l,flagg,nl;
	 int flaga,y1,y2,d,f,jp;
	public void init(){
	au=getAudioClip(getCodeBase(), "mario.mid");
	au1=getAudioClip(getCodeBase(), "Jump.wav");
	
	  addKeyListener(this);
	  jp=300;
	  nl=1;
	  flagg=1;
	  y2=350;
	  l=0;
	  y1=600;
	  flaga=4;
	  flag=0;
	  x=0;
	  x1=200;
	  d=200;
	  f=400;
	  t=0;
	  p=300;
	  q=450;
	  j=10;
	  jmp=0;
	  au.loop();
	}
	public void keyTyped(KeyEvent e){
		s=s+e.getKeyChar();
		nl=1;
		repaint();
	}
	public void keyPressed(KeyEvent e){
		showStatus("Key Down");
		int key=e.getKeyCode();
		switch(key){
		case KeyEvent.VK_F1:
        s=s+"<F1>";
        break;
        case KeyEvent.VK_F2:
        s+="<F2>";
        break;
        case KeyEvent.VK_F3:
        s+="<F3>";
        break;
        case KeyEvent.VK_PAGE_DOWN:
        s+="<PgDn>";
        break;
        case KeyEvent.VK_PAGE_UP:
        s+="<PgUp>";
        break;
        case KeyEvent.VK_LEFT:
		flag=98;
        s+="<Left Arrow>";
        break;
        case KeyEvent.VK_RIGHT:
		flag=1;
        s+="<Right Arrow>";
        break;
		case KeyEvent.VK_UP:
		flag=2;
        s+="<Up Arrow>";
        break;
        case KeyEvent.VK_DOWN:
        s+="<DOWN Arrow>";
        break;	
		}
		repaint();
	}	
	public void keyReleased(KeyEvent e){
		flag=0;
		j=10;
		showStatus("KeyEvent Up");
	}	
	public void paint(Graphics g){
		//background pic
		/*Image img5=getImage(getCodeBase(),"back.jpg");
	     g.drawImage(img5,t,0,this);
	  g.drawImage(img5,t+1024,0,this);
	  g.drawImage(img5,t+2048,0,this);
	  */
	  //road
		g.setColor(Color.red);
	  g.fillRect(0,y1-50,1400,100);
	  g.setColor(Color.black);
	  g.fillRect(x,y1,100,20);
	  g.fillRect(x+150,y1,100,20);
	  g.fillRect(x+300,y1,100,20);
	  g.fillRect(x+450,y1,100,20);
	  g.fillRect(x+600,y1,100,20);
	  g.fillRect(x+750,y1,100,20);
	  g.fillRect(x+900,y1,100,20);
	  g.fillRect(x+1050,y1,100,20);
	  g.fillRect(x+1200,y1,100,20);
	  g.fillRect(x+1350,y1,100,20);
	  g.setColor(Color.white);
	  g.fillRect(x1+1000,550,100,100);
	  g.fillRect(x1+2150,550,100,100);
	  g.fillRect(x1+4000,550,100,100);
	  g.fillRect(x1+6000,550,100,100);
	  
	  //jumping box
	  g.setColor(Color.blue);
	  g.drawRect(x1+400,y2,50,50);
	  g.drawRect(x1+1500,y2,50,50);
	  g.drawRect(x1+1550,y2,50,50);
	  g.drawRect(x1+2500,y2,50,50);
	  g.drawRect(x1+3200,y2,50,50);
	  g.drawRect(x1+3250,y2,50,50);
	  g.drawRect(x1+3300,y2,50,50);
	  g.drawRect(x1+4700,y2,50,50);
	  g.drawRect(x1+4750,y2,50,50);
	  g.setColor(Color.pink);
	  g.fillRect(x1+400,y2,49,50);
	  g.fillRect(x1+1500,y2,49,50);
	  g.fillRect(x1+1550,y2,49,50);
	  g.fillRect(x1+2500,y2,49,50);
	  g.fillRect(x1+3200,y2,49,50);
	  g.fillRect(x1+3250,y2,49,50);
	  g.fillRect(x1+3300,y2,49,50);
	  g.fillRect(x1+4700,y2,49,50);
	  g.fillRect(x1+4750,y2,49,50);
	  
	  
	  //star pic
	  Image img7=getImage(getCodeBase(),"star.gif");
	  g.drawImage(img7,d,f,this);
	  g.drawImage(img7,d+5,f,this);
	  g.drawImage(img7,d+10,f,this);
	  //g.drawImage(img7,d+100,f,this);
	  //g.drawImage(img7,d+700,f,this);
	  g.drawImage(img7,d+1000,f,this);
	  g.drawImage(img7,d+1005,f,this);
	  g.drawImage(img7,d+2000,f,this);
	  g.drawImage(img7,d+2005,f,this);
	  g.drawImage(img7,d+2010,f,this);
	  g.drawImage(img7,d+3000,f,this);
	  g.drawImage(img7,d+3010,f,this);
	  g.drawImage(img7,d+3015,f,this);
	  g.drawImage(img7,d+4300,f,this);
	  g.drawImage(img7,d+4305,f,this);
	  g.drawImage(img7,d+5000,f,this);
	  g.drawImage(img7,d+5005,f,this);
	  g.drawImage(img7,d+5010,f,this);
	  //add problems
	  Image img909=getImage(getCodeBase(),"SMB1PiranhaPlantSmallAni.gif");
	  g.drawImage(img909,d+200,500,this);
	  g.drawImage(img909,d+1300,500,this);
	  g.drawImage(img909,d+3000,500,this);
	  g.drawImage(img909,d+2300,500,this);
	  
	  //start
	  if(flagg==1){
		  Image img56=getImage(getCodeBase(),"star.gif");
	  g.drawImage(img56,d+700,f,this);
	  }
	  else if(flagg==0){}
	  
	  
	  
	  if(flaga==5){
		  g.setColor(Color.red);
		  g.drawString("game over",300,400);
	  }
	  
	  
	  else if(flaga==4){
	  if(flag==1){
		  x--;
		  j=5;
		  t--;
		  x1--;
		  d--;
		  jp++;
		  Image img=getImage(getCodeBase(),"101.gif");
	  g.drawImage(img,p,q,this);
	  }
	  
	  
	  else if(flag==2){
		  jmp=2;
		  au1.play();
		  j=400;
		 Image img1=getImage(getCodeBase(),"100.png");
		  for(int n=0;n<100;n++){
	      g.drawImage(img1,p,q-n,this);
		  }
		  if(jp>=575&&jp<=650){
			  q=250;
		  }
		  else{
		  for(int n=100;n>100;n--){
	     g.drawImage(img1,p,q-100+n,this);
		  }
		  }
	  }
	  
	  
	  
	  else if(flag==98){
		  au1.play();
		  j=400;
		   Image img1=getImage(getCodeBase(),"100.png");
		   for(int n=0;n<100;n++){
	      g.drawImage(img1,p,q-n,this);
		  x=x-1;
		  t=t-1;
		  d=d-1;
		  x1=x1-1;
		  jp=jp+1;
		  }
		  for(int n=100;n>0;n--){
	     g.drawImage(img1,p,q-100+n,this);
		 x=x-1;
		 t=t-1;
		  d=d-1;
		  x1=x1-1;
		  jp=jp+1;
		 // jd=jd+1;
		  }
		/* x=x-60;
		  //j=5;
		  t=t-60;
		 x1=x1-60;
		  d=d-60;*/
	  }
	  
	  
	  else if(flag==0){
		  Image img2=getImage(getCodeBase(),"marpic.jpg");
	  g.drawImage(img2,p,q,this);
    }
	  
	   if(x==-150){
		  x=0;
	  }
	  if(t==-1024){
		  t=0;
	  }
	  if(x1+1000<=p+25&&p+25<x1+1100||x1+2150<=p+25&&p+25<x1+2250||x1+4000<=p+25&&p+25<=x1+4100||6000<=p+25&&p+25<x1+6100){
        if(q==450){		 
		flaga=5;
		}
	  }
	  if(jp>=880&&jp<=950){
		  if(q<=400&&q>=100){
		  flagg=0;
	  }
 }
	  
	  //for jump at box
	  if(jp>=575&&jp<=650 || jp>=1675&&jp<=1800 || jp>=2670&&jp<=2750 || jp>=3370&&jp<=3410|| jp>=4870&&jp<=5000){		 
			
			if(q<450){
				q=250;
	  
	     }
		 
		 
	  }
	  else{
		  q=450;
	  }
	  
	  
	  try{
	Thread.sleep(j);
}
catch(InterruptedException e){}
repaint();
	 }
 }
 
}	/*<applet code="mario12.class" width=1350 height=700></applet>*/
	
	
	
	
	
	
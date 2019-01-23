void setup(){
  size(500,500); 
 
}
void draw(){
  for(int size = 200; size>0;size -=30){
    
   
  
  
  if(size/30%2==0){
   fill(255,0,0); 
  }
else{
  fill(0,0,255); 

}
 ellipse(250,250,size, size); 
  }  
}
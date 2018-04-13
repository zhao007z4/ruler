#Ruler

//
Point point = new Point();
getWindowManager().getDefaultDisplay().getRealSize(point);
DisplayMetrics dm = getResources().getDisplayMetrics();
float physicsW = (point.x/ dm.xdpi)*25.4;  
float physicsH = (point.y / dm.ydpi)*25.4; 

CSDN:https://blog.csdn.net/zhao007z5/article/details/79923716
rulerhttps://github.com/lovely3x/WeightAndHeightMeasurer

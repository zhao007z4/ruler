#Ruler

//获取屏幕物理尺寸大小
Point point = new Point();
getWindowManager().getDefaultDisplay().getRealSize(point);
DisplayMetrics dm = getResources().getDisplayMetrics();
float physicsW = (point.x/ dm.xdpi)*25.4;  
float physicsH = (point.y / dm.ydpi)*25.4; 

米尺绘制参考：https://github.com/lovely3x/WeightAndHeightMeasurer

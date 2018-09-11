# SwipeBackDemo
#[![](https://jitpack.io/v/Achenglove/SwipeBackDemo.svg)](https://jitpack.io/#Achenglove/SwipeBackDemo)
侧滑关闭Activity依赖库，使用简单，几行代码解决你的烦恼

#引入依赖库
```
dependencies {
	        implementation 'com.github.Achenglove:SwipeBackDemo:v1.0'
	}
  ```
  
  #Application
  ```
   @Override
    public void onCreate() {
        super.onCreate();
        this.registerActivityLifecycleCallbacks(ActivityStack.getInstance());
    }
  ```

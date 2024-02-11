# GSon Tutorials

This is a short tutorial on how to use GSon to work with Java Json objects like serializing and deserializing.

__Json is wildly used in all application hence learning about it is very important__.

## GSon Initialization

To work with GSon start by initializing the GSon object with relevant methods.

```java
import com.google.gson.Gson;
import com.stemgon.models.Product;

Gson gson = new Gson();

var s = gson.toJson(Product);
System.in.out.println(s);

```

You can also use this method;

```java

import com.google.gson.GsonBuilder;

GsonBuilder gsonBuilder = new GsonBuilder();
var gson = gsonBuilder.create();
```
# Bootiful AdminLTE

integrate with [Spring Boot](http://spring.io/projects/spring-boot) and [AdminLTE](http://adminlte.io/) in 3 ways:

1. static
2. [Webjars](https://www.webjars.org/)
3. [Bower](https://bower.io/)

Choose one you familiar with.

More detailed instruction: [Blog](https://yingw.github.io/2018/02/22/adminlte-springboot.html)

## static

**Clone project**
```
git clone https://github.com/yingw/bootiful-adminlte.git
```

**Download AdminLTE release**
```
wget https://github.com/almasaeed2010/AdminLTE/archive/v2.4.3.zip
unzip v2.4.3.zip
```

**Copy bower_components** folder to projects' `src/main/resources/static` folder
```
cp v2.4.3/bower_components bootiful-adminlte/src/main/resources/static/
```
7000+ files, slow coping, wait...

**Run**
```
mvn spring-boot:run
```

## webjars

Or we can use webjars to avoid the download, **checkout branch**
```
git checkout webjars
```

**Run**
```
mvn spring-boot:run
```

> No need bower_components folder.

## bower

**Checkout branch**
```
git checkout branch
```

Run
```
mvn spring-boot:run
```

This will auto download all components in `src/main/resources/static` folder then run.

## Tips

If you'd like to use the **static** solution, you can first checkout **bower** branch and run `mvn package` to auto-download all files needed then check back.
```
git checkout bower
mvn package
git checkout master
```

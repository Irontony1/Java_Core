FROM library/openjdk:latest
COPY ./src ./src
RUN mkdir ./out
RUN javac -sourcepath ./src -d out src/ru/jcore/sample/Main.java   
CMD java -classpath ./out ru/jcore/sample/Main 
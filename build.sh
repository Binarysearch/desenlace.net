cd desenlace-front
ng build --prod
cp dist/desenlace-front/*.* ../desenlace-back/src/main/webapp/
cd ../desenlace-back
mvn clean 
mvn package
rm src/main/webapp/*.*
cp target/desenlace.war ../desenlace.war
cd ..
cd desenlace-front
npm install
ng build --prod
cp dist/desenlace-front/*.* ../desenlace-back/src/main/webapp/
cd ../desenlace-back
mvn clean 
mvn package
cp target/desenlace.war ../desenlace.war
cd ..
package com.example.streamApi.docker_commands;

public class Main {


    //docker
    //es hraman@ cuyc kta te inj commandner kan ev vorn inje anum

    //docker info
    //cuyc kta te  qani hat,container ka,canihatnen runnig,stop ev ayln,talis e more details info

    //docker images
    //talise info bolor image neri masin

    //docker ps
    //talise info bolor containerneri masin

    //docker {some_command} -- help
    //cucy kta te ed hramani het inj ogtakar commandner kan

    //docker stop {container_id}
    //stope anum container@

    //docker start {container_id}
    //starte anum container@

    //docker pause {container_id}
    //pausa e anum container@

    //docker unpause {container_id}
    //pausa-ic hanume container@

    //docker restart {container_id}
    //restart e anum container@

    //docker rm {container-name}
    //jnjume hamapatasxan container@

    //docker pull {mysql}
    //qashumenq image.
    //ete konkret versiaenq uzum apa`  docker pull mysql:8


    //docker exec -it <container_name> bash
    //es hramanov mtnumenq containeri mej

    //amen angam erb image-enq run talis misht nor containere stexcvum

    //docker run {IMAGE_NAME}
    //stexcume container hamapatasxan image-i himan vra, stexcvume bayc runnig stateum chi lini

    //docker run --name {name of container}  {IMAGE-NAME}
    //ays depqum stexcvume container mer uzac anunov, stexcvuume bayc running stateum chi lini

    //docker run -it --name {container-name} {immage-name}
    //-it sa rune anum interactive mode-ov,ev shell-um karoxenq code grel hamapatasxan lezvi hamar
    //kstexci container mer uzac anunov hamapatasxan image i hamar ev interactive-rejimum klini,aysinq stexceluc heto running statem klini
    //ays commandic heto tanume tvyal lezvui shell ev karoxenq code grel terminali mej
    //ayd shellic durs galu hamar ogtagorcumenq ctrl+d

    //docker kill {container-name}
    //ays hraman@ kille anum container@,bayc aveli lave docker stop command@ ogtagorcenq
    //ete docker stop {container_name} hraman@ chi ashxatum ayd depqum nor karelie docker kill anel

    //docker images rm {IMAGE_ID}
    //jnjumenq hamapatasxan imagen

    //WITH DOCKERFILE
    //docker build .
    //es hramanov runenq anum mer dockerfile-ic immage,ev anpayman petca commanLinov linenq ayd path-um
    //docker build -t {name} .  -t da title miangamic image stexcvum anunov

    //docker run -p 8080:60 --name may-cont image-name
    //erb menq dockerfile mej EXPOSE:60 senc baneq grum nshanakume mer container@ serverum starta linelu ed portum
    //-p 8080:60  -es hramanov asumenq vor mer local kompi 8080 port@ he5teveluye ayd serveri ayd portin


    //DockerFile  VS DockerCompose

    //dockerFile-um karoxenq mek image grenq ev hamapatasxan settingner@ tanq
    //isk dockercompose mej karoxenq shat image-ner grenq


    //docker-compose build
    //sarqume docker-compose.yaml-iimage


    //docker-compose up
    //starte anum containerner@


    //*****************************************************
    //MYSQL CONFIG
    //ays hramanov run enq anum mysql-i container@
    //mysql-docker-cont conatineri anunne
    //mysql-@ immage-i annune
    //docker run -d -p 3306:3306 --name mysql-docker-cont -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=exam -e MYSQL_USER=mihran -e MYSQL_PASSWORD=root mysql

    //*****************************************************
    //POSTGRESQL CONFIG
    //ays hramanov run enq anum postgresql-i container@
    //postgresql-cont  cantaineri anunne
    //pstgres-@ immagei anune
    //docker run --name postgresql-cont -p 5455:5432 -e POSTGRES_USER=mihran -e POSTGRES_PASSWORD=root -e POSTGRES_DB=postgresDB -d postgres

    //*****************************************************
    //https://hub.docker.com/r/jboss/keycloak/
    //KEYCLOACK CONFIG

    //PULL IMAGE
    //docker pull jboss/keycloak
    //*****************************************************

    //RUN CONTAINER
    //docker run jboss/keycloak
    //*****************************************************

    //EXPOSE A LOCALHOST
    //docker run -p 8080:8080 jboss/keycloak
    //*****************************************************

    //CREATING ADMIN ACCOUNT

    //docker run -p 8080:8080 -e KEYCLOAK_USER=admin -e KEYCLOAK_PASSWORD=admin --name keyc jboss/keycloak
    //*****************************************************

}

package com.example.streamApi.rest;

public class Main {
//What is Http?
    //Http-n pratakole ,handisanume transport mer harcumner@ katarelu hamar
    //inq@ server clienti mijev kapne apahovum


    //What are http request types? How many are there?
//    GET
    //get zapros@ url-um erevuma,vor@ resursner stanalu hamare,ays zaprosner@ iranc vra sahmanapakum unen 1024b
    //hamarvume IDEMPOTENT request vorovhetev injqanel kanches serverum resourcei chi poxvum

//    POST
    //post@ uni marmin ev nor resource stexcelu hamare,,
    // post zapros@ chi qeshavorvum default,chuni sahmanapakum,chi pahpanvum brauzeri istoriayi mej
    //QANi vor post@ stexcuma nor resource inq@ chi hamarvum IDEMPOTENT request
    //ete ameninj normala kveradardzni 201(created)

//    PUT
    //put zapros@ ogtagorcvume goyutyun unecox resource@ tarmacnelu hamar,aysinqn sarqumenq nor resource injvor field popoxvac ev save enq anum
    //put@ hamarvume IDEMPOTENT request,ete arajin angam put@ ashxati inq@ kpoxi resource-i vijak@
    //ev iranc hetoel injqanel kanchen PUT apa uxxaki override karvi tvyal resourcei vijak@
    //ete objectin gtnum poxuma kveradardzni 200(OK),ete chi gtnum apa 204(No Content)


//    PATCH
    //nmane PUT zaprosin uxxaki chenq sarqum resurs@,,ayl uxxaki ayd fieldnenq uxarkum,
    //PATCH@ hamarvume IDEMPOTENT
    //ete objectin gtnum poxuma kveradardzni 200(OK),ete chi gtnum apa 204(No Content)

//    HEAD
    //head zapros@ nmane get zaprosin,uxxaki ete get@ karoxe list verdardznel apa head@ chi veradardznum
    //kareli ogtagorcel stugelu hamar get zapros@
    //HEAD@ hamarvum e IDEMPOTENT qani vor eli chi poxum serverum resource-i vijak

//    DELETE
    //jnjume resurs@
    //DELEET@ hamarvume IDEMPOTENT
    //arajin zapros@ kgna id ov kjnji ev kta 200ok
    //erkrord zapros@ nuyn idov kberi 404,irakanum patasxanner@ tarber en,bayc serverum eli resourcei vijak chi poxvel


//    OPTIONS
    //options req@ nkaragrume resoursi het ashxatelu hamar grocox parametr@r,,orinak put,get,deleta metodner@ kam vor contenttyp@ jsone
    //OPTIONS@ hamarvume IDEMPOTENT


//    TRACE
    //Trace harcum@ stugume depi resource tanox chanaparh@


    //IDEMPOTENT API
    //IDEMPOTENT HTTP-i methodner@ ayn methodnernen voronq karoxenq shat angam kanchel ev rezult@ lini nuyn@
    //baci postic mnacac HTTP methodner@ IDEMPOTENT en


    //POST vs PUT
    //Put zapros@ amboxjovin update e anum resource-n
    //Put@ idempotent requeste
    //Post@ idempotent request che vortev amen post request aneluc inq@ nor resource patrastum serverum klini popoxutyun

    //PUT VS PATCH
    //PUT zapros@ amboxjovin update anum resource-n ete chka apa kstexci nor@
    //resource-i invvor field update anelu hamar menq petqa lriv resoucen uxarkenq dra hamar,
    //ete amboxch resource-n chuxarken ayl menak popoxvox field@ apa ayn resource bolor fielder-i tex@ kdni ayd popoxvac field@
    //PATCH@ anelu hamar uxarkum enq menak resourcei popoxvox field@
    //PATCH@ amboxjutyamb chi update anum resoucen


    //POST VS GET
    //Get zaprosner@ qeshavormvumen
    //Get zaprosner@ mnumen Brauzeri hoistorii mej
    //Get zapros@ uni sahmanapakum-1024 byte
    //Get zapros@ kcvuma URL-in;
    //GET zapros@ injvor resource poxelu hamar chi
    //POST methodov uxarkvac tvyalner@ mnume HTTP-i body-i mej


    //What is a cacheable request? Which requests are cacheable?

    //erb brauzeric requesta uxxarkvum server stugvuma te qeshi mej ka ayd resource-i kopian ete ka apa cache-ice vercvum  ev
    //aveli aragacnuma performancve,,ete chka apa harcum@ gnume server ev aytexic e vercnum response
    //GET@ ev HEAD@ qeshavorvox zaprosner en


    //What is request header and response header and the same for cookies?
    //REQUEST HEAD@ ogtagorcvume serverin lracucich texekutyunner haxordelu hamar requesti contenti masin
    //orinak te inj METHODA,
    //vor URL-ine call anum
    //inj browser e ogtagorcvel
    //clienti operacion hamakargi versian
    //ayn eji path@ vortexic request@ ekele


    //REsponcse headerumel erevuma orinak ardyunq@ orinak 200ok

    //What is cookie
    //Cookie-ner@ text fayleren voronq pahumen tvyalneri poqr hatvac`orinak useri anun ev password
    //Cookie-nerum pahvox tvyalner@  stexcvumen serverum. ev cookie fayleri mej pahvume unique ID;
    //@st ayd unique ID-i server@ chanachume mer hamakargich@ ev giti te inj informacia petqa tramadri


    //qani vor REST@ arxitekturni stile inq@ sahmanum e kanonner voronq ogtagorcvum en web carayutyunner@ stexcelu hamar

    //u ayd web carayutyunner@ voronq hetevumen Resti vochin hamarvum en REST FULL carayutyunner
    //REst@ sahmanum e 6 hat chartarapetakan sahmanapakumner

    //1.UNIFORM INTERFACE
    // API-@ petqa unena mek tramabanakan URL,vor@  aveli lave hamapatasxanecnel web eji het
    //petqa lini rest full.petqa ogtagorci http-i (get,post,putd,elete) methodner@
    //petqe veradardzni http response body


    //STATELESS
    //ir koxmic server@ chi pahpanum injvor state clienti sessioni jamanak
    //server@ chpetqe ogtagorci clienti state @ ir hetaqrqrutyan hamar ayd session-i jamanak


    //3.CACHEABLE
    // amen request petqa parunaki informacia te ayd request@ qeshavorvuma te che
    //ete nshvac che apa request@ petqa qeshavorvi

    //4.CLIENT-SERVER
    //petqa lini client, server,resource-ner, ev resource-ner@ petqe kaTavarvi HTTP -ov
    //client@ petqe chimana serveri business logikayi masin ev petqe imana menak serveri url-i masin


    //5.LAYERED SYSTEM - tuyle talis  shertavorel hamakarg@,
    //application@ karoxe deploy line A serveri vra
    //Databasen karoxe linel B serveri vra
    //Authenticate servernel karoxe linel C serveri vra


    //6.CODE ON DEMAND - sa miak optional sahmanapakumne
    //himnakanum server@ uxarkume clientin XML kam JSON
    //erb server@ karoxe execute linox code tramadrel clientin,javascript kam java apletner;


    //Describe REST maturity model    //LEVELS
    //RESTFULL Api stanalu hamar petqe pahenq Maturity model-i  bolor levelner@
    //REST maturity model@ baxkacace 4 levelic

                                   //LEVEL-0
    //LEVEL-0- vorpes pratakol petqa ogtagorcvi HTTP-n,petqa unenal mek URL,Url-um chpetqa ogtagocvi underscore (_), ayl -,kogtagorcven naev lowerCase, ev mek method,sovorabar POST method@
    //CREATE : POST /api/user
    //READ :   POST /api/user
    //UPDATE : POST /api/user
    //DELETE : POST /api/user

                                    //LEVEL-1
    //LEVEL-1- ays levelum kunenanq mi qani url tarber operationner katarelu hamar,ev bolor methodner@ klinne POST methodner
    //CREATE : POST /api/users/create
    //READ   : GET /api/users, GET /api/user/read
    //UPDATE : POST /api/users/update
    //DELETE : POST /api/users/delete
    //SEARCH : GET or POST /api/users?sort=name

                                    //LEVEL-2
    //LEVEL-2- amen HTTP request peqe lini hamapatasxan methodov, ev amen request petqe tramadri response code
    //CREATE : PUT /api/users
    //READ   : GET /api/users/42
    //UPDATE : POST /api/users/42
    //DELETE : DEL /api/users/42
    //SEARCH : GET /api/users?sort=name

                                    //LEVEL-3
    //LEVEL-3 - ays level@ ir mej nerarume bolor levelner@ ev response uxarkume naev JSON,petqe ogtagorcel hypermedia (HATEOAS)
    //HATEOAS-@ da erb vor menq uxarkumenq tvyalner@ ev ayd tvyalneri het kapvac gorcoxutyunner@ JSONI-tesqov
    //orinak nerqevi JSON-i mej ka tvyal ev hxumner voronq ayd tvyalneri het kapvac gorcoxutyunnern en
    //CREATE : PUT /api/users/create
    //READ : GET /api/users/42
    //UPDATE : POST /api/users/42
    //DELETE : DEL /api/users/42
    //SEARCH : GET /api/users?sort=name
    //
    //Self-descriptive Response Body:
    //HTTP/1.1 200 OK
    //
    //{
    //  "_embedded" : {
    //    "users" : [ {
    //      "username" : "admin", ...
    //      "_links" : {
    //        "self" : { "href" : "http://localhost:8080/api/users/1" },
    //        "user" : { "href" : "http://localhost:8080/api/users/1" }
    //      }
    //    }, {
    //      ...
    //    } ]
    //  }
}

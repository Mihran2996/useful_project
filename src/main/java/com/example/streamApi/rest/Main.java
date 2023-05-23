package com.example.streamApi.rest;

public class Main {

    //LINKS
    //https://learning.mlytics.com/the-internet/http-request-methods/#:~:text=Methods%20like%20PUT%20or%20DELETE,and%20it%20is%20considered%20cacheable.
    //https://www.tutorialspoint.com/http/http_requests.htm

    //WHAT IS HTTP?
    //HTTP is an application layer stateless protocol used to transfer information between two network devices,
    //such as a browser, mobile phone, and web server.
    //Devices communicate with each other by sending HTTP requests and receiving HTTP responses.
    //It is running on 80 port

    //******************************************************************************************************************

    //IDEMPOTENT REQUESTS
    //Idempotency means that multiple identical requests will have the same outcome.
    //So it does not matter if a request is sent once or multiple times.
    //The following HTTP methods are idempotent: GET, HEAD, OPTIONS, TRACE, PUT and DELETE.
    //All safe HTTP methods are idempotent, PUT and DELETE are idempotent but not safe.
    //Note` that idempotency does not mean that the server has to respond in the same way on each request.
    //For example, assume we want to delete a project by an ID using a DELETE request:
    //DELETE /projects/123 HTTP/1.1
    //As response we might get an HTTP 200 status code indicating that the project has been deleted successfully.
    //If we send this DELETE request again, we might get an HTTP 404 as response because the project has already been deleted.
    //The second request did not alter the server state, so the DELETE operation is idempotent even if we get a different response.

    //******************************************************************************************************************

    //SAFE (HTTP Methods)
    //An HTTP method is safe if it doesn't alter the state of the server.In other words, a method is safe if it leads to a read-only operation.
    //Several common HTTP methods are safe: GET, HEAD, or OPTIONS. All safe methods are also idempotent,
    //but not all idempotent methods are safe. For example, PUT and DELETE are both idempotent but unsafe.

    //******************************************************************************************************************

    //GET
    //GET request method is used to get a resource from the server
    //GET request is attached to URL
    //GET requests cannot have a message body, but you still can send data to the server using the URL parameters
    //GET method is defined as idempotent, which means that multiple identical GET requests should have the same effect as a single request
    //GET requests can be cached
    //GET requests remain in the browser history
    //GET requests can be bookmarked
    //GET requests have length restrictions 1024b
    //GET request returns 200 OK

    //******************************************************************************************************************

    //HEAD
    //The only difference between HTTP HEAD and GET requests is that for HTTP HEAD, the server only returns headers without body.
    //The HTTP HEAD method is much faster than the HTTP GET method because much less data is transferred in HEAD requests.
    //Browsers use the HEAD method to update information about cached resources to check if the resource has been modified since the last time it was accessed.
    //If the resource has not been modified, browsers reuse the local copy without issuing a new request.
    //Otherwise, they request an updated version of the resource with a GET request.
    //The meta-information returned in the HTTP headers for a HEAD request must be identical to the meta-information returned for a GET request.
    //HTTP HEAD requests cannot have a message body.
    //You still can send data to the server using the URL parameters.
    //HEAD requests can be cached
    //HEAD returns 200 OK
    //HEAD is IDEMPOTENT and SAFE request

    //******************************************************************************************************************

    //POST
    //HTTP POST method is used to create or add a resource on the server.
    //POST request requires a body in which you define the data of the entity to be created.
    //The POST request can not be cashed, and does not remain in the browser history
    //The POST request is not IDEMPOTENT, while the POST creates new resource and changes the server side state
    //IF the all has been passed normal it will return 201 (CREATED)

    //******************************************************************************************************************

    //PUT
    //The PUT request is used for changing an existing resource
    //If the resource has been found and changed it will return 200 (OK) or 204 (NO CONTENT),
    //If the resource is not found it will create resource and return 201 (CREATED)  because of it Put is unsafe.
    //For the first time we send PUT request for changing an existing resource given some value,
    //But if we repeat the same request given the same value in the server side the value of resource will stay same,
    //Because of it The PUT request is IDEMPOTENT but not SAFE

    //******************************************************************************************************************

    //PATCH
    //The PATCH request changes an existing resource partial, does not require sending the entire body with the request.
    //If the resource has been found and modified it'll return 200(OK), otherwise 204(No Content)
    //THE PATCH request can be IDEMPOTENT and NOT IDEMPOTENT ... EXAMPLE`
    //
    //IDEMPOTENT EXAMPLE
    //
    //Original resource
    //{
    //  name: 'Tito',
    //  age: 32
    //}
    //
    // PATCH request
    //{
    //  age: 33
    //}
    //
    // New resource
    //{
    //  name: 'Tito',
    //  age: 33
    //}
    //In a single or multiple request the result will be the same `   {
    //                                                                  name: 'Tito',
    //                                                                  age: 33
    //                                                                 }.
    //
    //NOT IDEMPOTENT EXAMPLE................................................
    //
    // PATCH request
    //{
    //  $increment: 'age' //This may in MongoDB database
    //}
    //In this case each request will return different result ` age++

    //******************************************************************************************************************

    //DELETE
    //The DELETE request is used for deleting some request from the server
    //The DELETE request is IDEMPOTENT but not SAFE
    //The server can respond to each request in a different way, for example`
    //If we send DELETE request like this `  "DELETE users/1"  for the first time we will get 200 OK, the resource has been deleted
    //If we send same request next time we will get 404 and won't alert any state in the server side.
    //Because of it DELETE request is IDEMPOTENT but not SAFE.

    //******************************************************************************************************************

    //OPTIONS
    //The HTTP OPTIONS method is used to describe communication options for the target resource.
    //Browsers send an HTTP OPTIONS request to find out the supported HTTP methods
    //The OPTIONS request is IDEMPOTENT and SAFE.

    //******************************************************************************************************************

    //TRACE
    //HTTP TRACE method returns the contents of client HTTP requests in the entity-body of the TRACE response.

    //******************************************************************************************************************

    //CONNECT
    //The HTTP CONNECT request method is used to set up two-way communication between the client and the resource on the origin server,
    //through one or more proxy servers. The operation is not safe, idempotent, or cacheable.

    //******************************************************************************************************************

    //POST VS PUT
    //The PUT is IDEMPOTENT but not SAFE
    //THE PUT method is used to modify a resource, it used for UPDATE operations
    //THE PUT method is non cacheable
    //The PUT method updates the resource completely
    //If an existing resource is updated it will return 200(Ok) or 204 (NO CONTENT)
    //If the resource is not found it will create the resource and will return 201 (CREATED)
    //...................................................................................
    //The POST method is not IDEMPOTENT
    //The POST method sometimes is cacheable
    //This method is used for creating a new resource, it used for CREATE operations
    //It will return 201 (CREATED)

    //******************************************************************************************************************

    //PUT VS PATCH
    //The PUT method updates the resource completely if the resource does not exist it will create new resource
    //For updating any field of resource we need send entire body.
    //If we send only the updating field instead of entire body it will update all resource and all field will have that new passed value.
    //If the resource has been found and changed it will return 200 (OK) or 204 (NO CONTENT),
    //If the resource does not exist it will create new and will return 201 (CREATED)
    //PUT is IDEMPOTENT and unsafe.
    //...................................................................................
    //The PATCH method modifies the resource only partial, for updating we need send only that field.
    //If the resource has been found and modified it'll return 200(OK), otherwise 204(No Content)
    //The PATCH method can be IDEMPOTENT and NOT IDEMPOTENT

    //******************************************************************************************************************

    //POST VS GET
    //The GET method is used for retrieval the data.
    //The Get method is cacheable and remains in the browser history
    //The GET method has restriction ` 1024b
    //The GET method is attached in the URL.The GET method has not body, but we can send value using URL parameter
    //The GET method is IDEMPOTENT and SAFE
    //The GET method can be bookmarked
    //....................................................................................
    //The POST method is used for creating new data
    //The POST method can not be ramin in the browser history
    //The POST method can not be bookmarked
    //The POST method has body, can send file, image and so on...
    //The POST method has not any restriction
    //The POST method is not attached in the URL

    //******************************************************************************************************************

    //CAN WE SEND DATA USING THE HTTP HEAD METHOD?
    //No, HTTP HEAD requests cannot have a message body.
    //But you still can send data to the server using the URL parameters.
    //In this case, you are limited to the maximum size of the URL, which is about 2000 characters (it depends on the browser).

    //******************************************************************************************************************

    //WHAT IS A CACHEABLE REQUEST? WHICH REQUEST IS CACHED?
    //GET: The GET method is cacheable by default. It is intended for retrieving a representation of a resource without modifying it.
    //GET requests are idempotent, meaning that multiple identical requests should have the same effect as a single request.
    //............................................................
    //HEAD: The HEAD method is also cacheable by default. It is similar to a GET request, but it only retrieves the response headers,
    //not the actual content. HEAD requests are typically used to check the status or metadata of a resource without fetching its full representation.

    //******************************************************************************************************************

    //WHAT IS REQUEST HEADER AND RESPONSE HEADER AND THE SAME FOR COOKIES?
    //HTTP headers let the client and the server pass additional information with an HTTP request or response.
    //REQUEST HEADER is used to pass additional information to the server. for example`...
    //method type ` GET, PUT,...
    //from which url is made the request
    //what browser is being used ` CHROME...
    //client's OS version`  windows10...
    //The path of page where has made the request
    //You can introduce your custom fields in case you are going to write your own custom Client and Web Server.
    //................................................................................
    //THE RESPONSE HEADER Just like HTTP request headers, HTTP response headers also contain details about the responses,

    //******************************************************************************************************************

    //WHAT ARE COOKIES?
    //Cookies are small files of information that a web server generates and sends to a web browser.
    //Web browsers store the cookies they receive for a predetermined period of time,
    //or for the length of a user's session on a website.
    //They attach the relevant cookies to any future requests the user makes of the web server.

    //******************************************************************************************************************

    //TYPES OF COOKIES
    //SESSIONS COOKIES:
    //Session cookie is only persists while the user is navigating or visiting a given website.
    //PERSISTENT COOKIES:
    //These persist for a configurable length of time or until a certain date that is set by the web server.
    //FIRST-PARTY COOKIES:
    //The cookie and information it contains is restricted to the same site on which it was set.
    //THIRD-PARTY COOKIES:
    //These cookies are not restricted to the initial site where the cookie was created
    //ZOMBIE COOKIES:
    //This refers to a type of cookie that persists, even after the user attempts to delete it
    //SECURE COOKIES:
    //It uses encryption for sending data

    //******************************************************************************************************************

    //WHERE ARE COOKIES STORED?
    //Web browsers store cookies in a designated file on users' devices.
    //The Google Chrome web browser, for instance, stores all cookies in a file labeled "Cookies."
    //Chrome users can view the cookies stored by the browser by opening developer tools,
    //clicking the "Application" tab, and clicking on "Cookies" in the left side menu.

    //******************************************************************************************************************

    //ARE COOKIES STATELESS?
    //No, cookies aren't stateless, they are pieces of information created by server
    //They will be not stateless because the information which they have must be attached in the request
    //with request they rich to the server and give more information about of current user,
    //For multiple request they keep information for the server.

    //******************************************************************************************************************

    //WHAT IS HATEOAS
    //The server should provide hypermedia links within its response to a client,
    //enabling the client to dynamically navigate the available resources and actions. In other words,
    //the server includes not only the requested data but also related links that the client can follow to discover
    //and interact with other resources.

    //******************************************************************************************************************

    //WHAT DOES HATEOAS SUGGEST?
    //The client does not need to have prior knowledge of the API's structure or specific endpoints. I
    //Instead, it can navigate through the application state by following the links provided by the server.

    //******************************************************************************************************************

    //WHAT ARE COOKIES USED FOR?
    //USER SESSIONS: or SESSIONS COOKIES
    //Suppose Alice has an account on a shopping website. She logs into her account from the website's homepage.
    //When she logs in, the website's server generates a session cookie and sends the cookie to Alice's browser.
    //This cookie tells the website to load Alice's account content, so that the homepage now reads, "Welcome, Alice."
    //Alice then clicks to a product page displaying a pair of jeans.
    //When Alice's web browser sends an HTTP request to the website for the jeans product page,
    //it includes Alice's session cookie with the request. Because the website has this cookie,
    //Server recognizes the user as Alice, and she does not have to log in again when the new page loads.
    //..............................................................................
    //PERSONALIZATION:
    //Cookies help a website "remember" user actions or user preferences,
    //If Alice logs out of the shopping website, her username can be stored in a cookie and sent to her web browser.
    //Next time she loads that website, the web browser sends this cookie to the web server,
    //which then prompts Alice to log in with the username she used last time.
    //
    //TRACKING: or THIRD-PARTY COOKIES
    //Some cookies record what websites users visit. This information is sent to the server
    //that originated the cookie the next time the browser has to load content from that server.
    //this process takes place anytime the browser loads a website that uses that tracking service.

    //******************************************************************************************************************

    //WHAT IS EDGE CACHE
    //Edge caching is a caching technique that stores frequently accessed data closer to the end-users.
    //This means that data is cached on servers closer to the end-users, rather than being stored in a central data center.
    //Edge caching is used to reduce the latency that can occur when data is transmitted over long distances,
    //which can slow down application performance. By storing frequently accessed data closer to the end-users,
    //edge caching can help improve application performance and enhance the user experience.

    //******************************************************************************************************************

    //WHAT IS STATELESS PROTOCOL
    //A stateless protocol is a type of communication protocol where each request and response between a client and a
    //server is independent and does not rely on any previous requests or stored session information
    //This means that every HTTP request the server receives is independent and does not relate to request that came prior to it
    //On a stateless protocol, the requests will be a bit different. The server doesn't hold the state of its client,
    //and therefore the client's position in the result-set needs to be sent as part of the requests

    //******************************************************************************************************************

    //WHAT ARE SOME WAYS OF REQUESTING DATA FOR GIVEN VERSION
    //QUERY PARAMETERS:
    //One approach is to include a version identifier as a query parameter in the URL when making the request
    //FOR EXAMPLE:  GET /api/data?version=1.2
    //
    //CUSTOM HEADERS:
    //Another option is to use custom headers to specify the version.
    //You can define a custom header, such as "X-API-Version" or "Accept-Version,"
    //and include the desired version number in the header value:
    //FOR EXAMPLE:  GET /api/data
    //              X-API-Version: 1.2
    //URL PATHS:
    //Alternatively, you can incorporate the version directly into the URL path.
    //This approach is often used when the API follows a versioning convention in the URL structure:
    //FOR EXAMPLE:  GET /api/v1.2/data

    //******************************************************************************************************************

    //WHAT ARE SOME NAMING CONVENTIONS IN REST?
    //https://medium.com/@nadinCodeHat/rest-api-naming-conventions-and-best-practices-1c4e781eb6a5
    //Use Nouns to represent resources / Not Verbs
    //Bad example  :  http://api.example.com/v1/store/CreateItems/{item-id}❌      (CreateItems)
    //
    //Good example :  http://api.example.com/v1/store/items/{item-id}✅            (items)
    //
    //Use Pluralized Nouns for resources
    //Bad example  :  http://api.example.com/v1/store/employee/{emp-id}❌          (employee)
    //
    //Good example :  http://api.example.com/v1/store/employees/{emp-id}✅         (employees)
    //
    //Use hyphens (-) to improve the readability of URIs
    //Bad example : http://api.example.com/v1/store/vendormanagement/{vendor-id}❌           (vendormanagement)
    //              http://api.example.com/v1/store/itemmanagement/{item-id}/producttype❌   (itemmanagement)(producttype)
    //              http://api.example.com/v1/store/inventory_management❌                   (inventory_management)
    //
    //Good example: http://api.example.com/v1/store/vendor-management/{vendor-id}✅          (vendor-management)
    //              http://api.example.com/v1/store/item-management/{item-id}/product-type✅  (item-management)(product-type)
    //              http://api.example.com/v1/store/inventory-management✅                    (inventory-management)
    //
    //Use forward slashes (/) for hierarchy but not trailing forward slash (/)
    //Bad example  : http://api.example.com/v1/store/items/❌              (items/)
    //
    //Good example : http://api.example.com/v1/store/items✅               (item)
    //
    //Avoid using file extensions
    //Bad example  : http://api.example.com/v1/store/items.json❌           (items.json)
    //
    //Good example : http://api.example.com/v1/store/items✅                (item)
    //
    //Version your APIs
    //For example : http://api.example.com/v1/store/employees/{emp-id}
    //
    //Use query component to filter URI collection
    //For example : http://api.example.com/v1/store/items?group=124

    //******************************************************************************************************************

    //qani vor REST@ arxitekturni stile inq@ sahmanum e kanonner voronq ogtagorcvum en web carayutyunner@ stexcelu hamar

    //u ayd web carayutyunner@ voronq hetevumen Resti vochin hamarvum en REST FULL carayutyunner
    //REST-@ sahmanum e 6 hat chartarapetakan sahmanapakumner

    //1.UNIFORM INTERFACE
    //API-@ petqa unena mek tramabanakan URL,vor@  aveli lave hamapatasxanecnel web eji het
    //petqa lini rest full, petqa ogtagorci http-i (get,post,put,delete) methodner@
    //petqe veradardzni http response body


    //STATELESS
    //ir koxmic server@ chi pahpanum injvor state clienti sessioni jamanak
    //server@ chpetqe ogtagorci clienti state @ ir hetaqrqrutyan hamar ayd session-i jamanak


    //3.CACHEABLE
    //amen request petqa parunaki informacia te ayd request@ qeshavorvuma te che
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

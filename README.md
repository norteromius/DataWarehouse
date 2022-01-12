# DataWarehouse

Application made in Java 8 + Spring Boot 2.6.2.

Idea was to prepare api endpoints with "base" functionality with optional parameters which will filter results - not finished due to lack of the time.
Enpoint created - /query. Example of usage:
curl.exe -v http://localhost:8080/query?datasource=Google%20Ads"&"campaign=GDN_Retargeting

Final version was planned to return JSON files, for now there are only strings.

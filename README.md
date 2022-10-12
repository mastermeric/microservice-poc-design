# microservice-poc-design
## Java Spring Cloud Implementasyonu

Spring Framework ekosisteminde yer alan Spring Cloud, Mikroservis mimari projelerimizde kullanabileceğimiz dağıtık bir bulut uygulamaları geliştirmemizi sağlayan kütüphanedir.

Spring Cloud içerisinde yer alan hizmetler ile birlikte mikroservis mimarileri baştan sona tasarlayabiliriz. Spring Cloud’un özelliklerine ve hizmetlere bakalım.

### **Özellikleri**

---

### **Load Balancing**

Mikroservislerimizin trafik dengelemesini izleyebilir, yönetebilir, dağıtabiliyoruz.

### **Dağıtık Konfigürasyon**

Her mikroservisin ayrı bir konfigürasyon dosyamız olsa da, global bir konfigürasyon da yapılandırabilmekteyiz.

### **Global locks**

Mikroservislerimizin thread işlemlerini işlem boyunca koruyan ve başka bir thread gelmemesini sağlayan önemli bir özelliktir.

### **Hizmetler**

---

### **Apı Gateway**

Mikroservislerimizin birbirine bağlanmasını sağlamaktadır. Servislerimizi yönetebilmemize olanak sağlamaktadır.

### **Service Discovery**

Mikroservislerimizin birbirlerinden haberdar olarak çalışmasına olanak sağlayan hizmettir.

### **Circuit Breakers**

Mikroservislerimizde oluşan hataların kendine has özelliklerini kullanarak servislerimizin sağlıklı çalışmasını sağlayan olanaklar sunmaktadır.

Spring Cloud’un özelliklerinden ve yapabileceklerimizi teorik olarak bahsettim sonraki yazılarımda bu bahsettiğim konulardan bahsederek Spring Cloud kullanarak mikroservis yazılımlar geliştireceğim.

## **Örnek Proje :**

- DB seçimi ;
**Cassandra** : Dağıtık yapıya çok uygundur..
**ElasticSearch** : fulltext search için idealdir..  (**NOT:** Elastic yanında birde Persistent DB gerekir)
- **ConfigServer:**  Server ların config lerini merkezileştirir..
- **Eureka (Service Registry) :** Scale olan çoklu instance ların IP yönetimlerini sağlar..
- **Hystrix;**   Netflix'in open source olarak yazılım dünyasına sunduğu ve dağıtık sistemlerde bağımlılıkların hata durumlarına karşı önlemler almak ve yönetmek amacıyla ortaya çıkmış bir kütüphanedir.  Crcuit Breaker vs görevleri vardır..
- 

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2f667e6c-fa2d-463f-b95f-3c22267d1386/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/7fe14041-a051-44cf-8540-a8769d66d6a6/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ac74ad62-e9b2-4c51-a56c-f7863b221178/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b66da863-a064-4609-af57-d363f1230a11/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/3fc77345-e02c-4fe3-b817-e65dbd3ef94e/Untitled.png)

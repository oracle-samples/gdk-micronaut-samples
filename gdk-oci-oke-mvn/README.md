# Deploy a Java Microservice to OCI Container Engine for Kubernetes (OKE) using the Graal Development Kit for Micronaut (GDK), and OCI Object Storage

This repo contains the sample code used in the Live Labs workshop --> [Deploy a Java Microservice to Oracle Cloud Infrastructure Container Engine for Kubernetes (OKE) using the Graal Development Kit for Micronaut (GDK)](https://livelabs.oracle.com/pls/apex/r/dbpm/livelabs/view-workshop?wid=3858)

## Git clone this sample

``` shell
git init lab
cd lab
git remote add origin https://github.com/oracle-samples/gdk-micronaut-samples.git
git config core.sparsecheckout true
echo "gdk-oci-oke-mvn/*">>.git/info/sparse-checkout
git pull --depth=1 origin main
## code gdk-oci-oke-mvn
```

## Micronaut 4.7.3 Documentation

- [User Guide](https://docs.micronaut.io/4.7.3/guide/)
- [API Reference](https://docs.micronaut.io/4.7.3/api/)
- [Configuration Reference](https://docs.micronaut.io/4.7.3/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/)
---
- [Micronaut Maven Plugin documentation](https://micronaut-projects.github.io/micronaut-maven-plugin/latest/)
## Feature http-client documentation

- [Micronaut HTTP Client documentation](https://docs.micronaut.io/latest/guide/index.html#nettyHttpClient)


## Feature kubernetes documentation

- [Micronaut Kubernetes Support documentation](https://micronaut-projects.github.io/micronaut-kubernetes/latest/guide/index.html)

- [https://kubernetes.io/docs/home/](https://kubernetes.io/docs/home/)


## Feature kubernetes-client documentation

- [Micronaut Official Kubernetes Java Client documentation](https://micronaut-projects.github.io/micronaut-kubernetes/latest/guide/#kubernetes-client)

- [https://github.com/kubernetes-client/java/wiki](https://github.com/kubernetes-client/java/wiki)


## Feature management documentation

- [Micronaut Management documentation](https://docs.micronaut.io/latest/guide/index.html#management)


## Feature maven-enforcer-plugin documentation

- [https://maven.apache.org/enforcer/maven-enforcer-plugin/](https://maven.apache.org/enforcer/maven-enforcer-plugin/)


## Feature object-storage-oracle-cloud documentation

- [Micronaut Object Storage - Oracle Cloud documentation](https://micronaut-projects.github.io/micronaut-object-storage/latest/guide/)

- [https://www.oracle.com/cloud/storage/object-storage/](https://www.oracle.com/cloud/storage/object-storage/)


## Feature oracle-cloud-sdk documentation

- [Micronaut Oracle Cloud SDK documentation](https://micronaut-projects.github.io/micronaut-oracle-cloud/latest/guide/)

- [https://docs.cloud.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdk.htm](https://docs.cloud.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdk.htm)


## Feature serialization-jackson documentation

- [Micronaut Serialization Jackson Core documentation](https://micronaut-projects.github.io/micronaut-serialization/latest/guide/)



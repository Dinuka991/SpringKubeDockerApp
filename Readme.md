# Introduction

In the realm of modern application development, various architectural paradigms
offer distinct advantages and trade-offs. 
Two prominent models are monolithic applications
and microservice architectures. Let's explore each briefly:

## Monolithic Application

A monolithic application is an all-in-one software architecture where 
all components, such as user interface, business logic, and data access layers, 
are tightly integrated and deployed as a single unit.
Scaling such applications typically involves replicating the entire application stack,
which can lead to inefficiencies.

## Microservice Architecture

In contrast, a microservice architecture decomposes an application into smaller, 
loosely coupled services, each responsible for a specific business function. 
This approach enables independent deployment, scalability, and flexibility,
as each service can be developed, deployed, and scaled independently.

## Batch Jobs

Batch jobs are short-lived processes that perform specific tasks or workloads and 
terminate upon completion, rather than waiting for user input. 
They are commonly used for data processing, ETL (Extract, Transform, Load) operations,
and scheduled tasks.

## Serverless Computing

Serverless computing, often associated with Function as a Service (FaaS), 
allows developers to build and deploy applications without managing underlying 
infrastructure. Functions are triggered by events or requests, automatically 
scaling to handle workload demands and charging only for resources consumed 
during execution.

## Additional Considerations

When developing applications on Azure using Java, consider leveraging
Azure services such as Azure Functions, Azure Batch, and 
Azure Kubernetes Service (AKS) to build scalable, resilient, 
and cost-effective solutions. Additionally, adopt best practices for monitoring,
logging, and security to ensure optimal performance and reliability.

## Spring Framework 

Spring framework is application development framework with invension control (Ioc).
core values of spring are Dependency injection , aspect orient programming and 
business abstraction. 

## Spring Data

Spring data simplified data access for relational and non relational data bases. 

## Spring Security 

Spring security is the de facto standed for securing spring base application. it
offers high level of authentication and access control. 

## Spring Cloud

Spring cloud is used for distributed system.Spring cloud comes with service discovery ,
configuration management, monitoring and good developer expirience. 

## Spring Batch 

Spring Batch is lightweight framework for robust batch , application that have 
vital for daily operation .

## Deployment oppotunities in Azure 

#### Virtual Machines

Azure virtual machines are windows and linux. VM allow to chose different linux like
ubuntu, red hat or SUSE. 

VM are usually starting point of lift and shift. which are process mitigate exisitng
system to azure. 

#### Containers 

AKS - AKS is use to manage kubernets services in Azure. 

#### Azure App Service 

One of the easiest and most straightforward deployment oppotunities for java application
on Azure is azure app service. 

#### Azure Spring Apps

Azure spring apps let you to focus on building spring boot apps without managing
insfastructure. Deploy your jar or code , and it will automatically write up your
service with spring service runtime. After you deploy the app you can easily 
monitor the performance. 

#### Functions 

You can deploy your java code as Azure function. you will benifit of getting 
tooling and integration with other Azure services. 

Here are the some examples 

Web mobile and internet
Bot or real time stream process
Automation of schedule task 


## Manage resource in Azure 

### Inroduction 

Cloud computing contains public , private and hybrid as  models. 

### Azure Solutions for public , private , and hybrid cloud. 

Cloud computing provide services and applications on demand over the internet. Servers , application , data, and
other resource are provide as service. 


### Infrastructure as a service 

IaaS is instant computer infrastructure , provisioned and managed
over the internet. 

#### Common scenario 

##### website hostinting
##### wep app
##### Storage backup , and recovery
##### High performance computing 
##### Big Data Analysis 

#### Advantage 

##### Eliminate capital cost and reduce ongoing cost
##### Improves business continuity and disaster recovery
##### Respond quicker to shifting business conditions 
##### Increase stability readability and supportability 

### platform as a service 

platform as a service is complete development and deployment environment 
in the cloude. with paas you can deploy and kind of application in clude.
paas include all the facilities of IaaS plus build tools  and midleware 
services as well. 

##### common scenarios 











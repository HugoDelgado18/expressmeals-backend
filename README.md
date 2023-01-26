# expressmeals-backend
# Spring Boot API with React UI

This example app shows how to create a Spring Boot API and display its data with a React UI.

Please read [Bootiful Development with Spring Boot and React](https://developer.okta.com/blog/2017/12/06/bootiful-development-with-spring-boot-and-react) to see how this app was created.

**Prerequisites:** [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) and [Node.js](https://nodejs.org/).

> [Okta](https://developer.okta.com/) has Authentication and User Management APIs that reduce development time with instant-on, scalable user infrastructure. Okta's intuitive API and expert support make it easy for developers to authenticate, manage, and secure users and roles in any application.

* [Getting Started](#getting-started)
* [Links](#links)
* [Help](#help)
* [License](#license)

## Getting Started

To install this application, run the following commands:

```bash
git clone https://github.com/HugoDelgado18/expressmeals-backend.git
git clone https://github.com/HugoDelgado18/expressmeals-frontend.git
cd expressmeals-backend
cd expressmeals-frontend
```

This will get a copy of the project installed locally. To install all of its dependencies and start each app, follow the instructions below.

To run the server, cd into the `src/main/java/com.expresmealsapp/ExpressmealsApplication` folder and run:

run main file method
```bash
./mvnw spring-boot:run
```

To run the client, cd into the `expressmeals-frontend` folder and run:

```bash
npm run start
```
You will need to populate backend manually using post man however front-end can take care of 
account creation.

```properties

```

```

## Links

This example uses the following libraries provided by Okta:

* [Okta Spring Boot Starter](https://github.com/okta/okta-spring-boot)
* [Okta React SDK](https://github.com/okta/okta-oidc-js/tree/master/packages/okta-react)

## Help

Please post any questions as comments on the [blog post](https://developer.okta.com/blog/2017/12/06/bootiful-development-with-spring-boot-and-react), or visit our [Okta Developer Forums](https://devforum.okta.com/). You can also email developers@okta.com if you would like to create a support ticket.

## License

Apache 2.0, see [LICENSE](LICENSE).
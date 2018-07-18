# Full SDK Build
FROM openjdk:8-alpine AS build

RUN apk update && apk upgrade && apk --no-cache add maven
WORKDIR /app
COPY . /app
RUN mvn clean package

# Minimum Image including output above
FROM payara/micro
COPY --from=build /app/target/ponz-article.war /opt/payara/deployments

EXPOSE 8080

FROM node:12.2.0-alpine AS frontendCompilation

WORKDIR /app

ENV PATH /app/node_modules/.bin:$PATH
COPY package.json /app/package.json
RUN npm install && npm install -g @angular/cli && npm cache verify

COPY . /app
RUN ng build --prod

######################

FROM node:12.2.0-alpine

WORKDIR /app/employees-client

COPY --from=frontendCompilation /app/dist/angular8-springboot-client/ .

WORKDIR /app
COPY app.js .

RUN npm install express --save

# EXPOSE 3001

CMD node app.js

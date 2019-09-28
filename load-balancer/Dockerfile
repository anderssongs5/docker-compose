FROM nginx:1.17.4-alpine

COPY nginx.conf /etc/nginx/nginx.conf

WORKDIR /etc/nginx/
#RUN ls -al

CMD ["nginx", "-g", "daemon off;"]

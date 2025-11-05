FROM alpine
RUN apk add nginx
EXPOSE 80
COPY ./ordinario-ftw /var/lib/nginx/html
COPY ./yael.conf /etc/nginx/http.d/default.conf
CMD ["nginx", "-g", "daemon off;"]


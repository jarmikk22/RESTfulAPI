FROM mysql:5.6
ENV MYSQL_ROOT_PASSWORD root
ENV MYSQL_DATABASE restful
ENV MYSQL_USER droot
ENV MYSQL_PASSWORD root
ADD script.sql /docker-entrypoint-initdb.d
EXPOSE 3306
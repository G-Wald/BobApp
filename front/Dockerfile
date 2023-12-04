FROM node:latest as build

COPY ./front /usr/local/app

WORKDIR /usr/local/app/front

RUN npm run build

RUN  ls
RUN  cd "/usr/local/app" && ls

FROM nginx:latest as production

RUN  ls
RUN  cd "/usr/local/app" && ls


COPY /usr/local/app/nginx.conf /etc/nginx/conf.d/default.conf
COPY --from=build /usr/local/app/dist/bobapp /usr/share/nginx/html

EXPOSE 80
FROM node:latest as build


COPY . /usr/local/app

WORKDIR /usr/local/app

RUN cd "/usr/local/app" && ls
RUN npm run build

FROM nginx:latest as production

COPY front/nginx.conf /etc/nginx/conf.d/default.conf
COPY --from=build /usr/local/app/dist/bobapp /usr/share/nginx/html

EXPOSE 80
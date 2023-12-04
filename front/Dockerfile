FROM node:latest as build

COPY . /usr/local/app

WORKDIR /usr/local/app/front

RUN npm run build

FROM nginx:latest as production

RUN ls

COPY /usr/local/app/front/nginx.conf /etc/nginx/conf.d/default.conf
COPY --from=build /usr/local/app/dist/bobapp /usr/share/nginx/html

EXPOSE 80
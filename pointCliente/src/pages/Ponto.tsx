import { IonContent, IonHeader, IonPage, IonTitle, IonToolbar } from '@ionic/react';
import ExploreContainer from '../components/ExploreContainer';
import './Ponto.css'

import React from 'react';

const Ponto = () => (
    <>
      <IonHeader>
        <IonToolbar>
          <IonTitle>Ponto</IonTitle>
        </IonToolbar>
      </IonHeader>
      <IonContent>
        <div
          style={{
            display: 'flex',
            alignItems: 'center',
            justifyContent: 'center',
            height: '100%',
          }}
        >
          Ponto content
        </div>
      </IonContent>
    </>
  );
  